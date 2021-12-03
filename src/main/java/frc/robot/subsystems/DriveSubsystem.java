// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.VelocityMeasPeriod;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class DriveSubsystem extends SubsystemBase {

  private static final WPI_TalonSRX leftBMotor = RobotMap.leftBackDriveMotor;
  private static final WPI_TalonSRX rightBMotor = RobotMap.rightBackDriveMotor;
  private static final WPI_TalonSRX leftFMotor = RobotMap.leftFrontDriveMotor;
  private static final WPI_TalonSRX rightFMotor = RobotMap.rightFrontDriveMotor;

  private static final XboxController driverController = RobotContainer.driverController ;

  /** Creates a new DriveSubsystem. */

  public void setModePercentVoltage() {
    leftFMotor.set(ControlMode.PercentOutput, 0);
    rightFMotor.set(ControlMode.PercentOutput, 0);

    leftBMotor.set(ControlMode.PercentOutput, 0);
    rightBMotor.set(ControlMode.PercentOutput, 0);
  }

  public static void drive(double throttle, double rotate) {
    leftFMotor.set(throttle + rotate);
    rightFMotor.set(throttle - rotate);

    leftBMotor.set(throttle + rotate);
    rightBMotor.set(throttle - rotate);
  }
  
  public void stop() {
    drive(0,0);
  }

  public DriveSubsystem() {

    leftBMotor.setNeutralMode(NeutralMode.Coast);
    rightBMotor.setNeutralMode(NeutralMode.Coast);
    leftFMotor.setNeutralMode(NeutralMode.Coast);
    rightFMotor.setNeutralMode(NeutralMode.Coast);

    leftBMotor.setInverted (false); 
    rightBMotor.setInverted (true);
    leftFMotor.setInverted (false); 
    rightFMotor.setInverted (true);

   leftBMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1);
   leftBMotor.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
   leftBMotor.configVelocityMeasurementPeriod(VelocityMeasPeriod.Period_10Ms);
   leftBMotor.configVelocityMeasurementWindow(10);
   leftBMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_12_Feedback1, 5, 10);

    rightBMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1);
    rightBMotor.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
    rightBMotor.configVelocityMeasurementPeriod(VelocityMeasPeriod.Period_10Ms);
    rightBMotor.configVelocityMeasurementWindow(10);
    rightBMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_12_Feedback1, 5, 10);

   leftFMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1);
   leftFMotor.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
   leftFMotor.configVelocityMeasurementPeriod(VelocityMeasPeriod.Period_10Ms);
   leftFMotor.configVelocityMeasurementWindow(10);
   leftFMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_12_Feedback1, 5, 10);

    rightFMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1);
    rightFMotor.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
    rightFMotor.configVelocityMeasurementPeriod(VelocityMeasPeriod.Period_10Ms);
    rightFMotor.configVelocityMeasurementWindow(10);
    rightFMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_12_Feedback1, 5, 10);


    

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
