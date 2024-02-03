package beyond.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class Items{
    public static Item
    mangle;
    public static final Seq<Item> serpuloItems = new Seq<>();

    public static void load(){
        mangle = new Item("Mangle", Color.valueOf("d99d73")){{
            hardness = 1;
            cost = 0.5f;
            alwaysUnlocked = true;
        }};
    }
}
