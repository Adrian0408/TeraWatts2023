// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class DriveTrain extends SubsystemBase {

private final TalonFX[] motors = {
  new TalonFX(Constants.DRIVETRAIN_LEFT_BACK_TALON),
  new TalonFX(Constants.DRIVETRAIN_RIGHT_BACK_TALON),
  new TalonFX(Constants.DRIVETRAIN_LEFT_FRONT_TALON),
  new TalonFX(Constants.DRIVETRAIN_RIGHT_FRONT_TALON)
};





 
  /** Creates a new ExampleSubsyitstem. */
  public DriveTrain() {
for (TalonFX motor : motors) {
  motor.configFactoryDefault();
  motor.setNeutralMode(NeutralMode.Brake);
  // motor.configSupplyCurrentLimit(new SupplyCurrentLimitConfiguration(true, 30, 0, 0 )); 
  
} 
// motors[2].set(ControlMode.Follower , motors[0].getBaseID());
// motors[3].set(ControlMode.Follower , motors[1].getBaseID());
// set the motors to rotate the same way

motors[1].setInverted(true);
motors[3].setInverted(true);

motors[2].follow(motors[0]);
motors[3].follow(motors[1]);
  }


public void setPercentOutput(double leftOutput, double rightOutput) {
  motors[0].set(ControlMode.PercentOutput, leftOutput);
  motors[1].set(ControlMode.PercentOutput, rightOutput);
}
  

    
  @Override
  public void periodic() {
    SmartDashboard.putNumber("Falcon Temperature 20 ", motors[0].getTemperature());
    
    SmartDashboard.putNumber("Falcon Temperature 21 ", motors[1].getTemperature());
    
    SmartDashboard.putNumber("Falcon Temperature 22 ", motors[2].getTemperature());
    
    SmartDashboard.putNumber("Falcon Temperature 23 ", motors[3].getTemperature());
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }


public static void tankDrive(double drivetrainSpeed, double drivetrainSpeed2) {
}



}
