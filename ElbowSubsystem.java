// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ElbowSubsystem extends SubsystemBase {
  private WPI_TalonSRX elbowMotor;

  public ElbowSubsystem() {
    elbowMotor = new WPI_TalonSRX(Constants.ELBOW_MOTOR_ID);
  }

  public void foldDownElbow() {
    elbowMotor.set(-0.75);
  }

  public void stopElbow() {
    elbowMotor.set(0);
  }

  public static void start() {
  }
}
