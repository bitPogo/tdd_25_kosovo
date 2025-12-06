package kata

// {PREFIX}1313198349182798123487148612354786145
object RotationMapper : RotationMapperContract {
    private fun String.extractRotation(): Int = drop(1).toInt()
    override fun map(rotation: String): Int {
        val numberRotation = rotation.extractRotation()

        return if (rotation.startsWith("L")) {
            numberRotation * -1
        } else {
            numberRotation
        }
    }
}
