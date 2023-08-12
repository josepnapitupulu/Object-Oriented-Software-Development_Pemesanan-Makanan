/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanmakanan;

/**
 *
 * @author MSI GAMING
 */
public enum DaftarMinuman {//implements enum pada program
    cocaCola, aqua, ichiOcha, cocoDrink, pocariSweat, nescafe, coklatDrink, fanta, torabikaCoffe, milo;
    public String toString(){
        switch (this){
            case cocaCola:
                return "COCA COLA";
            case aqua:
                return "AQUA";
            case ichiOcha:
                return "ICHI OCHA";
            case cocoDrink:
                return "COCO DRINK";
            case pocariSweat:
                return "POCARI SWEAT";
            case nescafe:
                return "NESCAFE";
            case coklatDrink:
                return "COKLAT DRINK";
            case fanta:
                return "FANTA";
            case torabikaCoffe:
                return "TORABIKA COFFEE";
            default:
                return "MILO";
        }
    }
}

