package kata

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RotationMapperTest {
    @Test
    fun `When map is called with a L-prefixed number, Then it return a negative Integer`() {
        // Arrange
        val expected = 42
        val input = "L$expected"

        // Act
        val actual = RotationMapper.map(input)

        // Assert
        assertEquals(
            actual = actual,
            expected = -1 * expected,
        )
    }

    @Test
    fun `When map is called with a R-prefixed number, Then it return a positive Integer`() {
        // Arrange
        val expected = 42
        val input = "R$expected"

        // Act
        val actual = RotationMapper.map(input)

        // Assert
        assertEquals(
            actual = actual,
            expected = expected,
        )
    }

    @Test
    fun `The RotationMapper fulfils the RotationContract`() {
        assertTrue {
            RotationMapper is RotationMapperContract
        }
    }
}
