package kata

fun crackSafe(
    startingPoint: Int,
    rotations: List<String>
): Int {
    var currentStartingPoint = startingPoint

    val positions = rotations.map { rotation ->
        calculateLine(
            rotation = rotation,
            startingPoint = currentStartingPoint,
        ).apply {
            currentStartingPoint = this
        }
    }

    return positions.count { position ->
        position == 0
    }
}
