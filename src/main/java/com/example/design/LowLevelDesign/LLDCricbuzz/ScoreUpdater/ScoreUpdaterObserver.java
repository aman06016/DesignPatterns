package com.example.design.LowLevelDesign.LLDCricbuzz.ScoreUpdater;


import com.example.design.LowLevelDesign.LLDCricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
