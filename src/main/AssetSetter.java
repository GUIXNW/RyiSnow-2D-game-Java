package main;

import entity.NPC_OldMan;
import monster.MON_GreenSlime;

public class AssetSetter {
    
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    // instantiate the object
    public void setObject() {}

    public void setNPC() {

        gp.npc[0] = new NPC_OldMan(gp);
        gp.npc[0].worldX = gp.tileSize*21;
        gp.npc[0].worldY = gp.tileSize*21;

        // gp.npc[0] = new NPC_OldMan(gp);
        // gp.npc[0].worldX = gp.tileSize*9;
        // gp.npc[0].worldY = gp.tileSize*10;
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
