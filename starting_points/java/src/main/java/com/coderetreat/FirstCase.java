package com.coderetreat;

import com.coderetreat.controller.LightsWithOutControl;
import com.coderetreat.service.ILights;

public class FirstCase {
    public static void main(String[] args){
        ILights lights = new LightsWithOutControl();

        lights.setLightsOn(887, 9, 959, 629);
        lights.setLightsOn(454, 398, 844, 448);
        lights.setLightsOff(539, 243, 559, 965);
        lights.setLightsOff(370, 819, 676, 868);
        lights.setLightsOff(145, 40, 370, 997);
        lights.setLightsOff(301, 3, 808, 453);
        lights.setLightsOn(351, 678, 951, 908);
        lights.toggleLights(720, 196, 897, 994);
        lights.toggleLights(831, 394, 904, 860);

        System.out.println("Lights on: "+lights.lightsCount());
    }
}
