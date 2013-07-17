package periodicraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import net.minecraftforge.common.EnumHelper;


@Mod(modid = "Periodicraft", name = "Metalistic Craft", version = "Alpha 1.1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)


public class PeriodicraftMod {
    //Block IDs
  int AluminiumOreBlockID;
	int AluminiumBlockID;
	int CopperOreBlockID;
	int PlatinumOreBlockID;
	int TungstenOreBlockID;
	int AluminiumBrickBlockID;
	int ChocolateOreBlockID;
	int ChocolateBlockID;
	int JoltiumOreBlockID;
	int ViridiumOreBlockID;
	int GorgariliumOreBlockID;
	int TadaniteOreBlockID;
	int AlloyFurnaceID;
	
	//Item IDs
	int AluminiumIngotID;
	int CopperIngotID;
	int PlatinumIngotID;
	int TungstenIngotID;
	int AluminiumPlateID;
	int SteelIngotID;
	int ChocolateBarID;
	int BrassIngotID;
	int JoltiumCrystalID;
    int CopperPickaxeID;
	int TadaniteIngotID;
	int GorgariliumIngotID;
	int ViridiumIngotID;
	int GorgariliumSwordID;
	int GorgariliumAxeID;
	int GorgariliumPickaxeID;
	
	//CreativeTab
	public static CreativeTabs tabMetalistic = new MetalisticTab(CreativeTabs.getNextID(), "Metalistic Craft");
	public static EnumToolMaterial MetalisticTools = EnumHelper.addToolMaterial("MetalisticTools", 1, 2000, 4.5F, 1, 2);
	    
	
	//3 is Attack
	//80 is durability
	//2.5f is digging speed
	
	//Blocks
	public static Block AluminiumOre;
	public static Block AluminiumBlock;
	public static Block CopperOre;
	public static Block PlatinumOre;
	public static Block TungstenOre;
	public static Block AluminiumBrick;
	public static Block ChocolateOre;
	public static Block ChocolateBlock;
	public static Block ViridiumOre;
	public static Block GorgariliumOre;
	public static Block JoltiumOre;
	public static Block TadaniteOre;
	public static Block AlloyFurnace;
	
	
	
	//Items
	public static Item AluminiumIngot;
	public static Item CopperIngot;
	public static Item PlatinumIngot;
	public static Item TungstenIngot;
	public static Item AluminiumPlate;
	public static Item SteelIngot;
	public static Item ChocolateBar;
	public static Item BrassIngot;
    public static Item JoltiumCrystal;
	public static Item CopperPickaxe;
	public static Item ViridiumIngot;
	public static Item GorgariliumIngot;
	public static Item TadaniteIngot;
	public static Item GorgariliumSword;
	public static Item GorgariliumAxe; 
	public static Item GorgariliumPickaxe;
	
	public static PeriodicraftMod instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());		
		
		config.load();
	    
		//Config For Blocks
		AluminiumOreBlockID = config.get("Block IDs", "Aluminium Ore Block ID", 1500).getInt();
		AluminiumBlockID = config.get("Block IDs", "Aluminium Block ID", 1501).getInt();
		CopperOreBlockID = config.get("Block IDs", "Copper Ore Block ID", 1503).getInt();
		PlatinumOreBlockID = config.get("Block IDs", "Platinum Ore Block ID", 1504).getInt();
		TungstenOreBlockID = config.get("Block IDs", "Tungsten Ore Block ID", 1506).getInt();
		AluminiumBrickBlockID = config.get("Block IDs", "Aluminium Brick Block ID", 1509).getInt();
		ChocolateOreBlockID = config.get("Block IDs", "Chocolate Ore Block ID", 1511).getInt();
		ChocolateBlockID = config.get("Block IDs", "Chocolate Block ID", 1513).getInt();
	    JoltiumOreBlockID = config.get("Block IDs", "Joltium Block ID", 1515).getInt();
        ViridiumOreBlockID = config.get("Block IDs", "Viridium Ore Block ID", 1516).getInt();
		GorgariliumOreBlockID = config.get("Block IDs", "Gorgarilium Ore Block ID", 1517).getInt();
		TadaniteOreBlockID = config.get("Block IDs", "Tadanite Ore Block ID", 1518).getInt();
		AlloyFurnaceID = config.get("Block IDs", "Alloy Furnace Block ID", 1519).getInt();
		CopperPickaxeID = config.get("Tool IDs", "Copper Pickaxe ID", 1521).getInt();
		ViridiumOreBlockID = config.get("Block IDs", "Viridium Ore Block ID", 1522).getInt();
		GorgariliumOreBlockID = config.get("Block IDs", "Gorgarilium Ore Block ID", 1523).getInt();
		TadaniteOreBlockID = config.get("Block IDs", "Tadanite Ore Block ID", 1524).getInt();
		
		
		//Config for Armor
		
		//Config for Items
		AluminiumIngotID = config.get("Item IDs", "Aluminium Ingot ID", 1502).getInt();
		CopperIngotID = config.get("Item IDs", "Copper Ingot ID", 1504).getInt();
		PlatinumIngotID = config.get("Item IDs", "Platinum Ingot ID", 1505).getInt();
		TungstenIngotID = config.get("Item IDs", "Tungsten Ingot ID", 1507).getInt();
		AluminiumPlateID = config.get("Plate IDs", "Aluminium Plate ID", 1508).getInt();
		SteelIngotID = config.get("Item IDs", "Steel Ingot ID", 1510).getInt();
		ChocolateBarID = config.get("Item IDs", "Chocolate", 1512).getInt();
		BrassIngotID = config.get("Item IDs", "Brass Ingot ID", 1514).getInt();
		JoltiumCrystalID = config.get("Item IDs", "Joltium Crystal", 1520).getInt();
		ViridiumIngotID = config.get("Item IDs", "Viridium Ingot ID", 1525).getInt();
		GorgariliumIngotID = config.get("Item IDs", "Gorgarilium Ingot ID", 1526).getInt();
	    TadaniteIngotID = config.get("Item IDs", "Tadanite Ingot ID", 1527).getInt();
		GorgariliumSwordID = config.get("Tool IDs", "Gorgarilium Sword ID", 1528).getInt();
	    GorgariliumAxeID = config.get("Tool IDs", "Gorgarilium Axe ID", 1529).getInt();
	    GorgariliumPickaxeID = config.get("Tool IDs", "Gorgarilium Pickaxe ID", 1530).getInt();
		
		//Creation of Blocks/Items
		this.AluminiumOre = new AluminiumOre(AluminiumOreBlockID);
		this.AluminiumBlock = new AluminiumBlock(AluminiumBlockID, Material.iron);
	    this.AluminiumIngot = new AluminiumIngot(AluminiumIngotID);
	    this.CopperOre = new CopperOre(CopperOreBlockID);
	    this.CopperIngot = new CopperIngot(CopperIngotID);
	    this.PlatinumIngot = new PlatinumIngot(PlatinumIngotID);
	    this.PlatinumOre = new PlatinumOre(PlatinumOreBlockID);    
	    this.TungstenOre = new TungstenOre(TungstenOreBlockID);
	    this.TungstenIngot = new TungstenIngot(TungstenIngotID);
	    this.AluminiumPlate = new AluminiumPlate(AluminiumPlateID);
	    this.AluminiumBrick = new AluminiumBrick(AluminiumBrickBlockID, Material.iron);
	    this.SteelIngot = new SteelIngot(SteelIngotID);
	    this.ChocolateOre = new ChocolateOre(ChocolateOreBlockID);
	    this.ChocolateBar = new ChocolateBar(ChocolateBarID);
	    this.ChocolateBlock = new ChocolateBlock(ChocolateBlockID, Material.cake);
	    this.BrassIngot = new BrassIngot(BrassIngotID);
	    this.JoltiumOre = new JoltiumOre(JoltiumOreBlockID);
	    this.AlloyFurnace = new AlloyFurnace(AlloyFurnaceID, true);
	    this.JoltiumCrystal = new JoltiumCrystal(JoltiumCrystalID);
	    this.CopperPickaxe = new CopperPickaxe(CopperPickaxeID, MetalisticTools);
	    this.TadaniteOre = new TadaniteOre(TadaniteOreBlockID);
	    this.GorgariliumOre = new GorgarilumOre(GorgariliumOreBlockID);
	    this.ViridiumOre = new ViridiumOre(ViridiumOreBlockID);
	    this.TadaniteIngot = new TadaniteIngot(TadaniteIngotID);
	    this.GorgariliumIngot = new GorgarilumIngot(GorgariliumIngotID);
	    this.ViridiumIngot = new ViridiumIngot(ViridiumIngotID);
	    this.GorgariliumSword = new GorgariliumSword(GorgariliumSwordID, MetalisticTools);
	    this.GorgariliumAxe = new GorgariliumAxe(GorgariliumAxeID, MetalisticTools);
	    this.GorgariliumPickaxe = new GorgariliumPickaxe(GorgariliumPickaxeID, MetalisticTools);
	    
	    config.save();
	    
	    
	  
	    //Block Registry
	LanguageRegistry.addName(AluminiumOre, "Aluminium Ore");
	MinecraftForge.setBlockHarvestLevel(AluminiumOre, "pickaxe", 1);
    GameRegistry.registerBlock(AluminiumOre, "aluminiumOre");
	
    LanguageRegistry.addName(AluminiumBlock, "Aluminium Block");
	MinecraftForge.setBlockHarvestLevel(AluminiumBlock, "pickaxe", 1);
    GameRegistry.registerBlock(AluminiumBlock, "aluminiumBlock");
	
    LanguageRegistry.addName(CopperOre, "Copper Ore");
    MinecraftForge.setBlockHarvestLevel(CopperOre, "pickaxe", 0);
    GameRegistry.registerBlock(CopperOre, "copperOre");
   
    LanguageRegistry.addName(PlatinumOre, "Platinum Ore");
    MinecraftForge.setBlockHarvestLevel(PlatinumOre, "pickaxe", 3);
    GameRegistry.registerBlock(PlatinumOre, "platinumOre");
    
    LanguageRegistry.addName(TungstenOre, "Tungsten Ore");
    MinecraftForge.setBlockHarvestLevel(TungstenOre, "pickaxe", 3);
    GameRegistry.registerBlock(TungstenOre, "tungstenOre");
    
    LanguageRegistry.addName(AluminiumBrick, "Aluminium Brick");
    MinecraftForge.setBlockHarvestLevel(AluminiumBrick, "pickaxe", 1);
    GameRegistry.registerBlock(AluminiumBrick, "aluminiumBrick");
    
    LanguageRegistry.addName(ChocolateOre, "Chocolate Ore");
    MinecraftForge.setBlockHarvestLevel(ChocolateOre, "pickaxe", 1);
    GameRegistry.registerBlock(ChocolateOre, "chocolateOre");
    
    LanguageRegistry.addName(ChocolateBlock, "Chocolate Block");
    MinecraftForge.setBlockHarvestLevel(ChocolateBlock, "pickaxe", 1);
    GameRegistry.registerBlock(ChocolateBlock, "chocolateBlock");
    
    LanguageRegistry.addName(JoltiumOre, "Joltium Ore");
    MinecraftForge.setBlockHarvestLevel(JoltiumOre, "pickaxe", 2);
    GameRegistry.registerBlock(JoltiumOre, "joltiumOre");
    
    LanguageRegistry.addName(AlloyFurnace, "Alloy Furnace");
    MinecraftForge.setBlockHarvestLevel(AlloyFurnace, "pickaxe", 1);
    GameRegistry.registerBlock(AlloyFurnace, "alloyFurnace");
    
    LanguageRegistry.addName(ViridiumOre, "Viridium Ore");
    MinecraftForge.setBlockHarvestLevel(ViridiumOre, "pickaxe", 2);
    GameRegistry.registerBlock(ViridiumOre, "ViridiumOre");
    
    LanguageRegistry.addName(GorgariliumOre, "Gorgarilium Ore");
    MinecraftForge.setBlockHarvestLevel(GorgariliumOre, "pickaxe", 2);
    GameRegistry.registerBlock(GorgariliumOre, "gorgariliumOre");
    
    LanguageRegistry.addName(TadaniteOre, "Tadanite Ore");
    MinecraftForge.setBlockHarvestLevel(TadaniteOre, "pickaxe", 2);
    GameRegistry.registerBlock(TadaniteOre, "tadaniteOre");
    
    
   
    //Ore Generator 
    EventManager eventmanager = new EventManager();
    GameRegistry.registerWorldGenerator(eventmanager);
    
    EventManager1 eventmanager1 = new EventManager1();
    GameRegistry.registerWorldGenerator(eventmanager1);
    
    EventManager11 eventmanager11 = new EventManager11();
    GameRegistry.registerWorldGenerator(eventmanager11);
    
    EventManager111 eventmanager111 = new EventManager111();
    GameRegistry.registerWorldGenerator(eventmanager111);
    
    EventManager1111 eventmanager1111 = new EventManager1111();
    GameRegistry.registerWorldGenerator(eventmanager1111);
    
    EventManager2 eventmanager2 = new EventManager2();
    GameRegistry.registerWorldGenerator(eventmanager2);
    
    EventManager21 eventmanager21 = new EventManager21();
    GameRegistry.registerWorldGenerator(eventmanager21);
    
    EventManager22 eventmanager22 = new EventManager22();
    GameRegistry.registerWorldGenerator(eventmanager22);
    
    EventManager23 eventmanager23 = new EventManager23();
    GameRegistry.registerWorldGenerator(eventmanager23);
    
    
    
    //Item Registry
    LanguageRegistry.addName(AluminiumIngot, "Aluminium Ingot");
    LanguageRegistry.addName(CopperIngot, "Copper Ingot");
    LanguageRegistry.addName(PlatinumIngot, "Platnium Ingot");
    LanguageRegistry.addName(TungstenIngot, "Tungsten Ingot");
    LanguageRegistry.addName(AluminiumPlate, "Aluminium Plate");
    LanguageRegistry.addName(SteelIngot, "Steel Ingot");
    LanguageRegistry.addName(ChocolateBar, "Chocolate Bar");
    LanguageRegistry.addName(BrassIngot, "Brass Ingot");
    LanguageRegistry.addName(JoltiumCrystal, "Joltium Crystal");
    LanguageRegistry.addName(CopperPickaxe, "Copper Pickaxe");
    LanguageRegistry.addName(GorgariliumIngot, "Gorgarilium Ingot");
    LanguageRegistry.addName(ViridiumIngot, "Viridium Ingot");
    LanguageRegistry.addName(TadaniteIngot, "Tadanite Ingot");
    LanguageRegistry.addName(GorgariliumSword, "Gorgarilium Sword");
    LanguageRegistry.addName(GorgariliumAxe, "Gorgarilium Axe");
    LanguageRegistry.addName(GorgariliumPickaxe, "Gorgarilium Pickaxe");
    
    
    
    
    //Smelting 
    GameRegistry.addSmelting(AluminiumOreBlockID, new ItemStack(AluminiumIngot), 0.7f);
	GameRegistry.addSmelting(CopperOreBlockID, new ItemStack(CopperIngot), 0.7f);
    GameRegistry.addSmelting(PlatinumOreBlockID, new ItemStack(PlatinumIngot), 3.0f);
    GameRegistry.addSmelting(TungstenOreBlockID, new ItemStack(TungstenIngot),1.5f);
    GameRegistry.addSmelting(TadaniteOreBlockID, new ItemStack (TadaniteIngot), 0.7f);
    GameRegistry.addSmelting(ViridiumOreBlockID, new ItemStack (ViridiumIngot), 0.7f);
    GameRegistry.addSmelting(GorgariliumOreBlockID, new ItemStack (GorgariliumIngot), 0.7f);

    //Crafting Misc
    //Crafting Blocks
    GameRegistry.addRecipe(new ItemStack(AluminiumBlock),
        "xxx", "xxx", "xxx", 
        'x', AluminiumIngot);
      		 
    GameRegistry.addRecipe(new ItemStack(AluminiumPlate),
    		"xx", "xx",
    		'x', AluminiumIngot);
    
	GameRegistry.addRecipe(new ItemStack(AluminiumBrick, 8),
	"BXB", "XBX", "BXB",
	'X', AluminiumIngot, 'B', Block.stoneBrick);
    
	GameRegistry.addRecipe(new ItemStack(ChocolateBlock),
	"xxx", "xxx", "xxx", 'x', ChocolateBar);
    
    GameRegistry.addRecipe(new ItemStack(CopperPickaxe),
    		"xxx", " S ", " S ", 'x', CopperIngot, 'S', Item.stick);
    
    GameRegistry.addRecipe(new ItemStack (GorgariliumSword), 
    		" x ", " x ", " S ", 'x',GorgariliumIngot, 'S',Item.stick);
    
    GameRegistry.addRecipe(new ItemStack (GorgariliumAxe), 
    		" xx", " Sx", " S ", 'x',GorgariliumIngot, 'S',Item.stick);
    

    GameRegistry.addRecipe(new ItemStack(GorgariliumPickaxe),
    		"xxx", " S ", " S ", 'x', GorgariliumIngot, 'S', Item.stick);
    
	}
}
