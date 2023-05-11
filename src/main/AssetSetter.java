package main;

import entity.NPC_OldMan;
import monster.MON_GreenSlime;
import object.OBJ_Axe;
import object.OBJ_Key;
import object.OBJ_Potion_Red;
import object.OBJ_Shield_Blue;

public class AssetSetter {
    
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    // instantiate the object
    public void setObject() {

        int i = 0;
        gp.obj[i] = new OBJ_Key(gp);
        gp.obj[i].worldX = gp.tileSize*25;
        gp.obj[i++].worldY = gp.tileSize*19;

        gp.obj[i] = new OBJ_Key(gp);
        gp.obj[i].worldX = gp.tileSize*21;
        gp.obj[i++].worldY = gp.tileSize*19;

        gp.obj[i] = new OBJ_Key(gp);
        gp.obj[i].worldX = gp.tileSize*26;
        gp.obj[i++].worldY = gp.tileSize*21;

        gp.obj[i] = new OBJ_Axe(gp);
        gp.obj[i].worldX = gp.tileSize*33;
        gp.obj[i++].worldY = gp.tileSize*21;

        gp.obj[i] = new OBJ_Shield_Blue(gp);
        gp.obj[i].worldX = gp.tileSize*35;
        gp.obj[i++].worldY = gp.tileSize*21;

        gp.obj[i] = new OBJ_Potion_Red(gp);
        gp.obj[i].worldX = gp.tileSize*22;
        gp.obj[i++].worldY = gp.tileSize*27;
    }

    public void setNPC() {

        int i = 0;
        gp.npc[i] = new NPC_OldMan(gp);
        gp.npc[i].worldX = gp.tileSize*21;
        gp.npc[i++].worldY = gp.tileSize*21;

        // gp.npc[i] = new NPC_OldMan(gp);
        // gp.npc[i].worldX = gp.tileSize*9;
        // gp.npc[i].worldY = gp.tileSize*10;
    }

    public void setMonster() {


        int i = 0;
        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize*21;
        gp.monster[i++].worldY = gp.tileSize*38;

        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize*23;
        gp.monster[i++].worldY = gp.tileSize*42;

        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize*24;
        gp.monster[i++].worldY = gp.tileSize*37;

        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize*34;
        gp.monster[i++].worldY = gp.tileSize*42;

        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize*38;
        gp.monster[i++].worldY = gp.tileSize*42;
    }
}
