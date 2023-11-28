package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="Drivercontrolled", group = "")
public class Drive extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor motorLeftFront;
    private DcMotor motorRightFront;
    private DcMotor motorLeftBack;
    private DcMotor motorRightBack;

    @Override
    public void runOpMode () {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        motorLeftFront = hardwareMap.get(DcMotor.class, "linksvoor");
        motorLeftBack = hardwareMap.get(DcMotor.class, "linksachter");
        motorRightBack = hardwareMap.get(DcMotor.class, "rechtsachter");
        motorRightFront = hardwareMap.get(DcMotor.class, "rechtsvoor");
        double x;
        double y;
        double TurnRate;



        waitForStart();
        runtime.reset();

        while (opModeIsActive()) {
            x = 0.5*gamepad1.left_stick_x;
            y = 0.5*gamepad1.left_stick_y;
            TurnRate = 0.5*(gamepad1.right_trigger - gamepad1.left_trigger);

            motorRightBack.setPower(x - y - TurnRate);
            motorLeftFront.setPower(-x + y - TurnRate);
            motorLeftBack.setPower(x + y - TurnRate);
            motorRightFront.setPower(x + y + TurnRate);
        }
    }
}
