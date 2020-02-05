/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.revrobotics.CANSparkMax;

/**
 * Add your docs here.
 */
public class WaterWheelScarpMobileSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  boolean beambreak = false;

  CANSparkMax waterWheel = new CANSparkMax(5);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void setWaterWheelPercentInput (double ratio) {
    waterWheel.set(ratio);
  }

  public void checkUpdateForBeamBreak () {

    // If check == true
    beambreak = !beambreak;

  }

}
