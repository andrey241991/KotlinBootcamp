package lesson5



fun <T : Generic.BaseBuildingMaterial> isSmallBuilding(building: Generic.Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}
isSmallBuilding(Building(Brick()))