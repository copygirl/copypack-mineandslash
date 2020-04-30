title   = "copypack-mineandslash"
authors = listOf("copygirl")
version = "0.1.0"
icon    = rootFolder.resolve("icon.png")

mcVersion = "1.14.4"
modloader { forge(Forge.mc1_14_4_latest) }

pack {
  multimc {
    selfupdateUrl = "https://meowface.org/copygirl/MineAndSlash/copypack-mineandslash.json"
  }
}

root<Curse> {
  releaseTypes = setOf(FileType.Release, FileType.Beta, FileType.Alpha)
  it.list {
    +Mod.appleskin
    +Mod.attributefix
    +Mod.bedspreads
    +Mod.betterAdvancements
    +Mod.blur
    +Mod.botania
    +Mod.bountifulbaubles
    +Mod.carryOn
    +Mod.charm
    +Mod.compactOres
    +Mod.controlling
    +Mod.cookingForBlockheads
    +Mod.corailWoodcutter
    +Mod.cosmeticArmorReworked
    +Mod.create
    +Mod.curioOfUndying
    +Mod.curiousElytra
    +Mod.curiousShulkerBoxes
    +Mod.decorativeBlocks
    +Mod.decorativeBlocksCompat
    +Mod.dudeWheresMyHorse
    +Mod.enchantedWolves
    +Mod.endergetic
    +Mod.extendedLightsMod
    +Mod.extraAnvils
    +Mod.fairyLights
    +Mod.fastfurnace
    +Mod.fastLeafDecay
    +Mod.fastworkbench
    +Mod.harvest
    +Mod.immersivePortalsForForge
    +Mod.inventorySpam
    +Mod.itemScroller
    +Mod.jei
    +Mod.largeOreDeposits
    +Mod.mineAndSlashAutoCompatibility
    +Mod.mineAndSlashReloaded
    +Mod.mixinbootstrap
    +Mod.morpheus
    +Mod.mrcrayfishFurnitureMod
    +Mod.mrcrayfishsVehicleMod
    +Mod.naturesAura
    +Mod.noIncreasingRepairCost
    +Mod.noRecipeBook
    +Mod.oreExcavation
    +Mod.overpoweredMending
    +Mod.quark
    +Mod.randompatches
    +Mod.reliquaryV13
    +Mod.respawnablePets
    +Mod.roadStuff
    +Mod.saveMyStronghold
    +Mod.strange
    +Mod.swingthroughgrass
    +Mod.theOneProbe
    +Mod.toastControl
    +Mod.trampleStopper
    +Mod.unenchanting
    +Mod.upgradeAquatic
    +Mod.upsizerMod
    +Mod.valhelsiaStructures
    +Mod.wallJump
    +Mod.waystones
    +Mod.waystones2waypoints
    +Mod.xaerosMinimap
    +Mod.xaerosWorldMap
  }
}
