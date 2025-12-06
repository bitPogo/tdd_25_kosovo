package kata

import kotlin.test.Test
import kotlin.test.assertEquals

class AcceptanceTest {
    @Test
    fun `When we call crackSafe Then we figure out all the clicks`() {
        // Arrange
        val inputs = listOf(
            "L68",
            "L30",
            "R48",
            "L5",
            "R60",
            "L55",
            "L1",
            "L99",
            "R14",
            "L82"
        )
        val startingPoint = 50

        // Act
        val actual = crackSafe(
            startingPoint = startingPoint,
            rotations = inputs,
        )

        // Assert
        assertEquals(
            actual = actual,
            expected = 3,
        )
    }
}
