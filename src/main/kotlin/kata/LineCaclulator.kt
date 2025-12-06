package kata

fun calculateLine(
    startingPoint: Int,
    rotation: String,
): Int {
    val movement = RotationMapper.map(rotation)
    val newPosition = startingPoint + movement

    return newPosition.mod(100)
}
