/*
 * Copyright (c) 2025 Newport Robotics Group. All Rights Reserved.
 *
 * Open Source Software; you can modify and/or share it under the terms of
 * the license file in the root directory of this project.
 */
 
package frc.robot.parameters;

import frc.robot.util.MotorDirection;

public interface ArmParameters {

  public String getArmName();

  public double getStowedAngleRad();

  /** Returns the min angle of the arm in radians. */
  public double getMinAngleRad();

  /** Returns the max angle of the arm in radians. */
  public double getMaxAngleRad();

  /** Returns the gear ratio. */
  public double getGearRatio();

  /** Returns the radians per revolution */
  public double getRadiansPerRevolution();

  /** Returns the robot motor parameters. */
  public MotorParameters getMotorParameters();

  /** Returns the direction the motor rotates when a positive voltage is applied. */
  public MotorDirection getMotorDirection();

  /** Returns the robot mass in kg. */
  public double getMass();

  /** Returns the robot arm length. */
  public double getArmLength();

  /** Returns kS feedforward constant in volts. */
  public double getkS();

  /** Returns kV feedforward constant in Vs/rad. */
  public double getkV();

  /** Returns kA feedforward constant Vs^2/rad. */
  public double getkAWithoutCoral();

  /** Returns kA feedforward constant with coral Vs^2/rad. */
  public double getkAWithCoral();

  /** Returns kG feedforward constant Vs^2/rad. */
  public double getkGWithoutCoral();

  /** Returns kG feedforward constant with coral Vs^2/rad. */
  public double getkGWithCoral();

  /** Returns the CAN ID of the motor. */
  public int getMotorID();

  /** Returns the max angular speed in rad/s. */
  public double getMaxAngularSpeed();

  /** Returns the scaled angular speed in rad/s. */
  public double getAngularSpeed();

  /** Returns the max angular acceleration in rad/s^2. */
  public double getMaxAngularAcceleration();

  /** Returns the scaled angular acceleration in rad/s^2. */
  public double getAngularAcceleration();

  /** Returns the max angular acceleration with coral in rad/s^2. */
  public double getMaxAngularAccelerationWithCoral();

  /** Returns the scaled angular acceleration with coral in rad/s^2. */
  public double getAngularAccelerationWithCoral();
}
