// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  private TalonFX leftFrontTalon = new TalonFX(Constants.DRIVETRAIN_LEFT_FRONT_TALON);
  private TalonFX rightFrontTalon = new TalonFX(Constants.DRIVETRAIN_RIGHT_FRONT_TALON);
  private TalonFX leftBackTalon = new TalonFX(Constants.DRIVETRAIN_LEFT_BACK_TALON);
  private TalonFX rightBackTalon = new TalonFX(Constants.DRIVETRAIN_RIGHT_BACK_TALON);

  //private final MotorControllerGroup leftMotors = new MotorControllerGroup();
  //private final MotorControllerGroup rightMotors = new MotorControllerGroup(rightFrontTalon, rightBackTalon);


  // private DifferentialDrive differentialDrive = new DifferentialDrive();

  public DriveTrain() {
    leftBackTalon.follow(leftFrontTalon);
    rightBackTalon.follow(rightFrontTalon);


 
  }
  private double leftOutput = 0, rightOutput = 0, magnitude = 1.0;

    public void setarcadeDrive(double moveSpeed, double rotateSpeed) {
      leftOutput = moveSpeed + rotateSpeed;
      rightOutput = moveSpeed - rotateSpeed;

        // Normalization
      magnitude = Math.max(Math.abs(leftOutput), Math.abs(rightOutput));
     if (magnitude > 1.0) {
      leftOutput /= magnitude;
      rightOutput /= magnitude;}
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

public double getAverageEncoderDistance() {
    return 0;
}



}



