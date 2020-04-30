title   = "copypack-mineandslash"
authors = listOf("copygirl")
version = "0.2.0"
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
    +Mod.botania
    +Mod.bountifulbaubles
    +Mod.carryOn
    +Mod.charm
    +Mod.compactOres
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
    +Mod.immersivePortalsForForge
    +Mod.jei
    +Mod.largeOreDeposits
    +Mod.mineAndSlashAutoCompatibility
    +Mod.mineAndSlashReloaded
    +Mod.mixinbootstrap
    +Mod.mrcrayfishFurnitureMod
    +Mod.mrcrayfishsVehicleMod
    +Mod.naturesAura
    +Mod.noIncreasingRepairCost
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
    +Mod.trampleStopper
    +Mod.unenchanting
    +Mod.upgradeAquatic
    +Mod.upsizerMod
    +Mod.valhelsiaStructures
    +Mod.wallJump
    +Mod.waystones

    // Placebo is a dependency of FastFurnace, FastWorkbench and Toast Control.
    // This is explicitly added because it likes to switch from being
    // required on both sides to only being required on the client. :/
    +Mod.placebo

    // Client-side recommended
    group {
      side = Side.CLIENT
      optional { selected = true }
    }.list {
      +Mod.controlling { description = "Allows searching for keybinds in the Controls menu." }
      +Mod.noRecipeBook { description = "Removes the Vanilla recipe button from your inventory." }
      +Mod.toastControl { description = "Disables tutorial and recipe 'toasts' from appearing." }
      +Mod.xaerosMinimap { description = "Minimap in Minecraft's style with waypoints." }
      +Mod.xaerosWorldMap { description = "World map that integrates well with Xaero's Minimap." }
    }

    // Client-side optional
    group {
      side = Side.CLIENT
      optional { selected = false }
    }.list {
      +Mod.blur { description = "Blurs out the world in the background when accessing inventories." }
      +Mod.inventorySpam { description = "Displays items added and removed from your player inventory." }
      +Mod.itemScroller { description = "Move items with your scroll wheel and other shortcuts." }
    }
  }
}
