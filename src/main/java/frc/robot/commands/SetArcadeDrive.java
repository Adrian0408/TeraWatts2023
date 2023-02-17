// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class SetArcadeDrive extends CommandBase {
  private final DriveTrain m_driveTrain;
  private double m_moveSpeed;
  private double m_rotateSpeed;
  /** Creates a new SetArcadeDrive. */
  public SetArcadeDrive(DriveTrain driveTrain, double moveSpeed, double rotateSpeed) {
    m_driveTrain = driveTrain;
    m_moveSpeed = moveSpeed;
    m_rotateSpeed = rotateSpeed;
    

  
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_driveTrain.setarcadeDrive(m_moveSpeed, m_rotateSpeed);


    m_moveSpeed = RobotContainer.driverController_1.getRawAxis(Constants.DRIVER_CONTROLLER_MOVE_AXIS);
    m_rotateSpeed = RobotContainer.driverController_2.getRawAxis(Constants.DRIVER_CONTROLLER_ROTATE_AXIS);
 
    
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
