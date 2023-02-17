package frc.robot.commands.autonomous;



// Copyright (c) FIRST and other WPILib contributors.
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.ElbowSubsystem;

public class AutonomousDrive extends CommandBase {

  private final DriveTrain m_driveTrain;
  private final Timer m_timer;
  
  public AutonomousDrive(DriveTrain driveTrain,ElbowSubsystem elbowSubsystem, Timer timer ) {
    m_driveTrain = driveTrain;
    m_timer = new Timer();
    addRequirements(driveTrain);
    
  
  }



  @Override
  public void initialize() {
    m_timer.start();
    ElbowSubsystem.start();
    
  }

  @Override
  public void execute() {


  
    // Calculate how far the robot should travel based on elapsed time
    double distance = m_timer.get() * Constants.DRIVETRAIN_SPEED;
    if (distance >= 7.0) {
      // Stop the robot if it has traveled 7 feet
      m_driveTrain.setarcadeDrive(0, 0);
    } else {
      // Move the robot forward
      m_driveTrain.setarcadeDrive(Constants.DRIVETRAIN_SPEED, 0);
    }
  }

  @Override
  public boolean isFinished() {
    return (null) != null;
  }




  
}