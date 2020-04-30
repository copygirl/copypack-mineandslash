plugins {
    // idea                           // automatically applied
    // kotlin("jvm") version "1.3.70" // automatically applied
    id("voodoo") version "0.5.9-SNAPSHOT"
}

voodoo {
    generatedSourceShared {
        rootDir -> rootDir.resolve("src/main/kotlin")
    }
    
    addTask("build") {
        build()
    }
    addTask(name = "changelog") {
        changelog()
    }
    addTask(name = "pack_voodoo") {
        pack().voodoo()
    }
    addTask(name = "pack_mmc-voodoo") {
        pack().multimcVoodoo()
    }
    addTask(name = "pack_mmc-fat") {
        pack().multimcFat()
    }
    addTask(name = "pack_server") {
        pack().server()
    }
    addTask(name = "test_mmc") {
        test().multimc()
    }
    addTask(name = "pack_all") {
        pack().server()
        pack().voodoo()
        pack().multimcVoodoo()
        pack().multimcFat()
    }

    generateForge("Forge", "1.14.4")
    generateCurseforgeMods("Mod", "1.14", "1.14.1", "1.14.2", "1.14.3", "1.14.4")

    // generateFabric("Fabric", stable = true)
    // generateCurseforgeMods("Mod", "1.15", "1.15.1", "1.15.2", categories = listOf("Fabric"))

    // generateCurseforgeTexturepacks("TexturePack", "1.15", "1.15.1", "1.15.2")
}
