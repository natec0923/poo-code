package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class RobotMap {
    
    public static final int LEFT_DRIVE_PORT = 1;
    public static final int RIGHT_DRIVE_PORT = 2;
    public static final int LEFT_F_DRIVE_PORT = 3;
    public static final int RIGHT_F_DRIVE_PORT = 4;


    public static WPI_TalonSRX leftBackDriveMotor = new WPI_TalonSRX(LEFT_DRIVE_PORT);
    public static WPI_TalonSRX rightBackDriveMotor = new WPI_TalonSRX(RIGHT_DRIVE_PORT);
    public static WPI_TalonSRX leftFrontDriveMotor = new WPI_TalonSRX(LEFT_F_DRIVE_PORT);
    public static WPI_TalonSRX rightFrontDriveMotor = new WPI_TalonSRX(RIGHT_F_DRIVE_PORT);
}
