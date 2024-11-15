package com.example.design.designPatterns.proxyPattern;

import java.util.HashMap;
import java.util.Map;

// Interface for downloading files
interface FileDownloader {
  void download(String url);
}

// Concrete class for real file download
class RealFileDownloader implements FileDownloader {

  @Override
  public void download(String url) {
    System.out.println("Downloading file from " + url);
    // Simulate downloading (replace with actual download logic)
    try {
      Thread.sleep(2000); // Simulate download time
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

// Class representing a cached file
class CachedFile {
  private final String url;
  private final byte[] data;

  public CachedFile(String url, byte[] data) {
    this.url = url;
    this.data = data;
  }

  public String getUrl() {
    return url;
  }

  public byte[] getData() {
    return data;
  }
}

// Interface for managing the cache
interface FileDownloadCache {
  CachedFile getCachedFile(String url);
  void cacheFile(String url, byte[] data);
}

// Simple in-memory cache implementation (replace with more robust caching)
class InMemoryCache implements FileDownloadCache {

  private final Map<String, CachedFile> cache = new HashMap<>();

  @Override
  public CachedFile getCachedFile(String url) {
    return cache.get(url);
  }

  @Override
  public void cacheFile(String url, byte[] data) {
    cache.put(url, new CachedFile(url, data));
  }
}

// Proxy class that controls access to the real downloader
class FileDownloadProxy implements FileDownloader {

  private final FileDownloader realDownloader;
  private final FileDownloadCache cache;

  public FileDownloadProxy(FileDownloader realDownloader, FileDownloadCache cache) {
    this.realDownloader = realDownloader;
    this.cache = cache;
  }

  @Override
  public void download(String url) {
    CachedFile cachedFile = cache.getCachedFile(url);
    if (cachedFile != null) {
      System.out.println("Using cached file for " + url);
      // Use data from cache (replace with logic to use cached data)
    } else {
      System.out.println("Downloading file from " + url + " (no cache)");
      realDownloader.download(url);
      // Cache the downloaded data (replace with actual caching logic)
      byte[] data = null/* download data */;
      cache.cacheFile(url, data);
    }
  }
}

// Usage Example
public class Main {
  public static void main(String[] args) {
    FileDownloader realDownloader = new RealFileDownloader();
    FileDownloadCache cache = new InMemoryCache();
    FileDownloader proxy = new FileDownloadProxy(realDownloader, cache);

    proxy.download("https://example.com/file1.txt");
    proxy.download("https://example.com/file1.txt"); // Uses cache

    proxy.download("https://example.com/file2.txt");
    proxy.download("https://example.com/file2.txt"); // Uses cache
  }
}
