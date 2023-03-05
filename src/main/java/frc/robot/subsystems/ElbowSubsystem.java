// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElbowSubsystem extends SubsystemBase {
  static CANSparkMax elbowMotor = new CANSparkMax(1, MotorType.kBrushless);
   static CANSparkMax armMotor = new CANSparkMax(2, MotorType.kBrushless);
   
  public ElbowSubsystem() {
    elbowMotor = new CANSparkMax(1, MotorType.kBrushless);
    armMotor = new CANSparkMax(2, MotorType.kBrushless);
    elbowMotor.setInverted(true);
    elbowMotor.follow(armMotor);
    
    
  }

  public void foldupElbow() {
    elbowMotor.set(-0.1);
    armMotor.set(.1);
  }

  public void stopElbow() {
    elbowMotor.set(0);
    armMotor.set(0);
  }

  public static void start() {
  }

public static void setPercentOutput(double y) {
  armMotor.set(y);
}
@Override
  public void periodic() {

  }
}
