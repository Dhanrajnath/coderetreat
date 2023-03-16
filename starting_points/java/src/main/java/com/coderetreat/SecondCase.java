package com.coderetreat;

import com.coderetreat.controller.LightsWithControl;
import com.coderetreat.service.ILights;

public class SecondCase {
    public static void main(String[] args){
        ILights lights = new LightsWithControl();

        lights.setLightsOn(0, 0, 0, 0);
        System.out.println("Total brightness: "+lights.lightsCount());

        lights.toggleLights(0, 0, 999, 999);
        System.out.println("Total brightness after all the lights are toggled: "+lights.lightsCount());
    }
}
