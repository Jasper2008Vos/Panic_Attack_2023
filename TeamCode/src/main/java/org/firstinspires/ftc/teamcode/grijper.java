package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp (name = "Grijper", group = "")
public class grijper extends LinearOpMode {

    private Servo Grijper;



    @Override
    public void runOpMode () {
        Grijper = hardwareMap.get(Servo.class, "Grijper");

        while (opModeIsActive()) {
            if (gamepad1.a) {
                Grijper.setPosition(0.5);
            }
            if (gamepad1.b) {
                Grijper.setPosition((0));
            }
        }
    }

}
