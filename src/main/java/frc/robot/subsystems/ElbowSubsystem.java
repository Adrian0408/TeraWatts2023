// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ElbowSubsystem extends SubsystemBase {
    elbowMotor = new CANSparkMax(1, MotorType.kBrushless);

  public ElbowSubsystem() {
    elbowMotor = new CANSparkMax(1, ControlMode.armController_1);
  }

  public void foldupElbow() {
    elbowMotor.set(-0.75);
  }

  public void stopElbow() {
    elbowMotor.set(0);
  }

  public static void start() {
  }
}
