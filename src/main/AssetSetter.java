package main;

import entity.NPC_OldMan;
import object.OBJ_Door;

public class AssetSetter {
    
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    // instantiate the object
    public void setObject() {
        gp.obj[0] = new OBJ_Door(gp);
        gp.obj[0].worldX = gp.tileSize*21;
        gp.obj[0].worldY = gp.tileSize*22;

        gp.obj[1] = new OBJ_Door(gp);
        gp.obj[1].worldX = gp.tileSize*23;
        gp.obj[1].worldY = gp.tileSize*25;
    }

    public void setNPC() {

        gp.npc[0] = new NPC_OldMan(gp);
        gp.npc[0].worldX = gp.tileSize*21;
        gp.npc[0].worldY = gp.tileSize*21;

        gp.npc[1] = new NPC_OldMan(gp);
        gp.npc[1].worldX = gp.tileSize*11;
        gp.npc[1].worldY = gp.tileSize*21;

        gp.npc[2] = new NPC_OldMan(gp);
        gp.npc[2].worldX = gp.tileSize*31;
        gp.npc[2].worldY = gp.tileSize*21;

        gp.npc[3] = new NPC_OldMan(gp);
        gp.npc[3].worldX = gp.tileSize*21;
        gp.npc[3].worldY = gp.tileSize*11;

        gp.npc[4] = new NPC_OldMan(gp);
        gp.npc[4].worldX = gp.tileSize*21;
        gp.npc[4].worldY = gp.tileSize*31;
    }
}
