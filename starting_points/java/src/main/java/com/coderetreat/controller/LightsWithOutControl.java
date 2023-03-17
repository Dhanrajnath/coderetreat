package com.coderetreat.controller;

import com.coderetreat.service.ILights;

public class LightsWithOutControl implements ILights {
    boolean christmasLights[][];

    public LightsWithOutControl() {
        christmasLights = new boolean[1000][1000];
    }

    @Override
    public int lightsCount() {
        int count = 0;
        for(int i=0; i<christmasLights.length; i++) {
            for(int j=0; j<christmasLights.length; j++) {
                if(christmasLights[i][j])
                    count += 1;
            }
        }
        return count;
    }

    @Override
    public void setLightsOff(int x1, int y1, int x2, int y2) {
        for(int i=x1; i<=y1; i++) {
            for(int j=x2; j<=y2; j++) {
                christmasLights[i][j] = false;
            }
        }
    }

    @Override
    public void setLightsOn(int x1, int y1, int x2, int y2) {
        for(int i=x1; i<=y1; i++) {
            for(int j=x2; j<=y2; j++) {
                christmasLights[i][j] = true;
            }
        }
    }

    @Override
    public void toggleLights(int x1, int y1, int x2, int y2) {
        for(int i=x1; i<=y1; i++) {
            for(int j=x2; j<=y2; j++) {
                christmasLights[i][j] = !christmasLights[i][j];
            }
        }
    }
}
