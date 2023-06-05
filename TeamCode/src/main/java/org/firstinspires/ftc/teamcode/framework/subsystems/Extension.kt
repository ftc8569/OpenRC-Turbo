package org.firstinspires.ftc.teamcode.framework.subsystems

import com.arcrobotics.ftclib.command.SubsystemBase
import org.firstinspires.ftc.teamcode.framework.utilities.AxonServo

class Extension(private val servo: AxonServo) : SubsystemBase() {
    var position = 0.0
        set(pos) = servo.setPosition(pos)

    init {
        register()
    }
}