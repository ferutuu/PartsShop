package Functionality;

import Components.CPU;
import Components.GPU;
import Components.MB;
import Components.RAM;

public class PartsInventory {

    static CPU[] cpuList = {

            new CPU("Intel","Core i5 12600K","LGA1700",4900,10,290),
            new CPU("Intel","Core i7 12700KF","LGA1700",5000,12,380),
            new CPU("Intel","Core i9 12900KF","LGA1700",5200,16,510),
            new CPU("Intel","Core i3 13100F","LGA1700",4500,4,130),
            new CPU("Intel","Core i7 13700F","LGA1700",5200,16,320),
            new CPU("Intel","Core i5 14400","LGA1700",4700,10,280),
            new CPU("Intel","Core i9 14900KS","LGA1700",6200,24,710),
            new CPU("AMD","Ryzen 3 3100","AM4",3900,4,100),
            new CPU("AMD","Ryzen 5 3500X","AM4",4100,6,160),
            new CPU("AMD","Ryzen 7 3800X","AM4",4500,8,190),
            new CPU("AMD","Ryzen 5 4500","AM4",4100,6,120),
            new CPU("AMD","Ryzen 5 5600","AM4",4400,6,170),
            new CPU("AMD","Ryzen 7 5700","AM4",4100,8,200),
            new CPU("AMD","Ryzen 7 5800X","AM4",4700,8,270),
            new CPU("AMD","Ryzen 7 7800X3D","AM5",5000,8,480)
    };


    static GPU[] gpuList = {

            new GPU("NVIDIA","GTX 1060",1785,6,130),
            new GPU("NVIDIA","GTX 1070",1683,8,180),
            new GPU("NVIDIA","GTX 1080",1733,8,300),
            new GPU("NVIDIA","RTX 2060",1680,6,200),
            new GPU("NVIDIA","RTX 2070",1620,8,300),
            new GPU("NVIDIA","RTX 2080",1710,8,400),
            new GPU("NVIDIA","RTX 3060",1777,12,330),
            new GPU("NVIDIA","RTX 3070",1725,8,450),
            new GPU("NVIDIA","RTX 3080",1710,10,600),
            new GPU("NVIDIA","RTX 4060",2460,8,400),
            new GPU("NVIDIA","RTX 4070",2475,12,550),
            new GPU("NVIDIA","RTX 4080",2600,16,1100),
            new GPU("NVIDIA","RTX 4090",2520,24,1800),
    };


    static RAM[] ramList = {
            new RAM("Corsair","Vengeance LPX","DDR4",3200,16,2,100),
            new RAM("Kingston","FURY Beast","DDR4",3200,64,2,250),
            new RAM("G.Skill","Ripjaws V","DDR4",3200,32,2,170),
            new RAM("Exceleram","Dark","DDR4",3200,32,2,150),
            new RAM("Corsair","Vengeance","DDR5",6600,64,2,300),
            new RAM("Kingston","FURY Beast RGB","DDR5",6000,64,2,330),
            new RAM("Kingston","FURY Renegade","DDR5",6000,64,2,300),
    };


    static MB[] mbList = {
            new MB("ASRock","B450M","Steel Legend","AM4","DDR4",100),
            new MB("MSI","B550","TOMAHAWK","AM4","DDR4",170),
            new MB("GIGABYTE","B550M","AORUS ELITE","AM4","DDR4",110),
            new MB("ASRock","B450M","Pro4","AM4","DDR4",80),
            new MB("ASUS","B550-PLUS","PRIME","AM4","DDR4",150),
            new MB("ASUS","X870-F","STRIX GAMING WIFI","AM5","DDR5",500),
            new MB("GIGABYTE","B650","AORUS PRO AX","AM5","DDR5",400),
            new MB("MSI","X870","TOMAHAWK WIFI","AM5","DDR5",410),
            new MB("ASUS","X870-P","PRIME WIFI","AM5","DDR5",420),
            new MB("GIGABYTE","B650","GAMING AX V2","AM5","DDR5",230),
            new MB("ASRock","B650M","PRO RS WIFI","AM5","DDR5",270),
    };
}
