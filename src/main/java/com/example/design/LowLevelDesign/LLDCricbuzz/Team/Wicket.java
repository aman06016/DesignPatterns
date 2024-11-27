package com.example.design.LowLevelDesign.LLDCricbuzz.Team;


import com.example.design.LowLevelDesign.LLDCricbuzz.Inning.BallDetails;
import com.example.design.LowLevelDesign.LLDCricbuzz.Inning.OverDetails;
import com.example.design.LowLevelDesign.LLDCricbuzz.Team.Player.PlayerDetails;

public class Wicket {

    public WicketType wicketType;
    public PlayerDetails takenBy;
    public OverDetails overDetail;
    public BallDetails ballDetail;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetail, BallDetails ballDetail){

        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetail = overDetail;
        this.ballDetail = ballDetail;
    }
}
