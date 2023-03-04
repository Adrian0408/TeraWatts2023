// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;


public class ArcadeDrive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private DriveTrain m_driveTrain;
private double m_leftOutput;
double m_rightOutput;
 





public ArcadeDrive(DriveTrain driveTrain, Double leftOutput, Double rightOutput) {

  m_driveTrain = driveTrain;
  
  

  

  // Use addRequirements() here to declare subsystem dependencies.
  addRequirements(driveTrain);

}

/**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
 
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
 m_driveTrain.setPercentOutput(m_leftOutput, m_rightOutput); }
 
 public void arcadeDrive(double throttleValue, double turnValue) {
  double leftOutput;
  double rightOutput;
  leftOutput = throttleValue + turnValue;
  rightOutput = throttleValue - turnValue;
  DriveTrain.tankDrive(leftOutput, rightOutput);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
