/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Constants;
import frc.robot.commands.Move;




public class Drivetrain extends Subsystem {
  public static DifferentialDrive m_myRobot;
  private Joystick j;
  public WPI_VictorSPX v1;
  private WPI_VictorSPX v2;
  private WPI_VictorSPX v3;
  private WPI_VictorSPX v4;
  
  public Drivetrain() 
  {
   j = new Joystick(Constants.joystick);
   v1 = new WPI_VictorSPX(Constants.RightLeader);
   v2 = new WPI_VictorSPX(Constants.LeftLeader);
   v3 = new WPI_VictorSPX(Constants.RightFollower);
   v4 = new WPI_VictorSPX(Constants.LeftFollower);
  SpeedControllerGroup leftMotors = new SpeedControllerGroup(v1, v3);
	SpeedControllerGroup rightMotors = new SpeedControllerGroup(v2, v4);

   m_myRobot = new DifferentialDrive(rightMotors, leftMotors);   
}
  @Override
  public void periodic() {
  

    // This method will be called once per scheduler run
  }
@Override
protected void initDefaultCommand() {
	// TODO Auto-generated method stub
	setDefaultCommand(new Move());
}
}
