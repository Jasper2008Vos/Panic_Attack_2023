package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "autonomous", group = "")
public class Autonomousv1 extends LinearOpMode {


    private DcMotor motorLeftFront;
    private DcMotor motorRightFront;
    private DcMotor motorLeftBack;
    private DcMotor motorRightBack;
    private DcMotor motorIntake;


    @Override public void runOpMode() {
        motorLeftFront = hardwareMap.get(DcMotor.class, "linksvoor");
        motorLeftBack = hardwareMap.get(DcMotor.class, "linksachter");
        motorRightBack = hardwareMap.get(DcMotor.class, "rechtsachter");
        motorRightFront = hardwareMap.get(DcMotor.class, "rechtsvoor");
        motorIntake = hardwareMap.get(DcMotor.class, "intake");

        waitForStart();

        motorLeftFront.setPower(-0.2);
        motorLeftBack.setPower(-0.2);
        motorRightFront.setPower(-0.2);
        motorRightBack.setPower(0.2);
        sleep(3500);

        motorLeftFront.setPower(0.2);
        motorLeftBack.setPower(0.2);
        motorRightFront.setPower(0.2);
        motorRightBack.setPower(-0.2);
        sleep(500);

        motorLeftFront.setPower(0);
        motorLeftBack.setPower(0);
        motorRightBack.setPower(0);
        motorRightFront.setPower(0);
    }


}
