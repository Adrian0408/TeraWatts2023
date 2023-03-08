// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;


public class ArcadeDrive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private DriveTrain m_driveTrain;
private DoubleSupplier m_leftOutput, m_rightOutput;
 

  public ArcadeDrive() {

}

 


 
  

public ArcadeDrive(DriveTrain m_driveTrain2, Object leftOutput, Object rightOuObject) {

}







/**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public void arcadeDrive(DriveTrain driveTrain, DoubleSupplier leftOutput, DoubleSupplier rightOutput) {
    m_driveTrain = driveTrain;
    m_leftOutput = leftOutput;
    m_rightOutput = rightOutput;
    

    

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveTrain);
  
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
 m_driveTrain.setPercentOutput(m_leftOutput.getAsDouble(), m_rightOutput.getAsDouble()); }
 
 public void arcadeDrive(double throttleValue, double turnValue) {
  double leftOutput;
  double rightOutput;
  
  throttleValue = -RobotContainer.driverController_1.getY();
  turnValue = RobotContainer.driverController_2.getX();

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
