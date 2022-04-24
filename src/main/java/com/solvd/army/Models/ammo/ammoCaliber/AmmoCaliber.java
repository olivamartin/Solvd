package com.solvd.army.Models.ammo.ammoCaliber;

public enum AmmoCaliber {

    PISTOLAMMO {
        public String getValue() {
            return "9mm";
        }
    },
    ASSAULTRIFLEAMMO {
        public String getValue() {
            return "5.56x39mm";
        }
    },
    SNIPERAMMO {
        public String getValue() {
            return ".50BMG";
        }
    };

}
