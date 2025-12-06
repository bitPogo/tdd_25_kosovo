package kata

import kotlin.test.Test
import kotlin.test.assertEquals

class CalutateClicksTest {
    @Test
    fun `When calculateLine is called with a Left Rotations which is smaller than the starting point, Then it maps it to a Position` () {
        // Arrange
        val rotation = "L40"
        val startingPoint = 50
        val expected =  10

        // Act
        val actual = calculateLine(
            startingPoint = startingPoint,
            rotation = rotation,
        )

        // Assert
        assertEquals(
            actual = actual,
            expected = expected,
        )
    }

    @Test
    fun `When calculateLine is called with a Left Rotations which is taller than the starting point, Then it maps it to a Position` () {
        // Arrange
        val rotation = "L68"
        val startingPoint = 50
        val expected =  82

        // Act
        val actual = calculateLine(
            startingPoint = startingPoint,
            rotation = rotation,
        )

        // Assert
        assertEquals(
            actual = actual,
            expected = expected,
        )
    }

    @Test
    fun `When calculateLine is called with a Left Rotations which is much taller than the starting point, Then it maps it to a Position` () {
        // Arrange
        val rotation = "L600"
        val startingPoint = 50
        val expected =  50

        // Act
        val actual = calculateLine(
            startingPoint = startingPoint,
            rotation = rotation,
        )

        // Assert
        assertEquals(
            actual = actual,
            expected = expected,
        )
    }

    @Test
    fun `When calculateLine is called with a Rotation, Then it maps it to a Position higher than startingPoint if the sum of Starting Point and Rotation is smaller` () {
        // Arrange
        val rotation = "R40"
        val startingPoint = 50
        val expected = 90

        // Act
        val actual = calculateLine(
            startingPoint = startingPoint,
            rotation = rotation,
        )

        // Assert
        assertEquals(
            actual = actual,
            expected = expected,
        )
    }

    @Test
    fun `When calculateLine is called with a Rotation, Then it maps it to a Position less than startingPoint if the sum of Starting Point and Rotation is bigger` () {
        // Arrange
        val rotation = "R60"
        val startingPoint = 50
        val expected = 10

        // Act
        val actual = calculateLine(
            startingPoint = startingPoint,
            rotation = rotation,
        )

        // Assert
        assertEquals(
            actual = actual,
            expected = expected,
        )
    }

    @Test
    fun `When calculateLine is called with a Rotation, Then it maps it to a Position less than startingPoint if the sum of Starting Point and Rotation is much bigger` () {
        // Arrange
        val rotation = "R600"
        val startingPoint = 50
        val expected = 50

        // Act
        val actual = calculateLine(
            startingPoint = startingPoint,
            rotation = rotation,
        )

        // Assert
        assertEquals(
            actual = actual,
            expected = expected,
        )
    }
}
