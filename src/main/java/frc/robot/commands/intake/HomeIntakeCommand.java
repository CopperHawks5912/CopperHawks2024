// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.IntakeArmConstants;
import frc.robot.subsystems.intake.IntakeArmSubsystem;

/** An example command that uses an example subsystem. */
public class HomeIntakeCommand extends Command {
  private final IntakeArmSubsystem m_IntakeArmSubsystem;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public HomeIntakeCommand(IntakeArmSubsystem intakeArmSubsystem) {
    m_IntakeArmSubsystem = intakeArmSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intakeArmSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_IntakeArmSubsystem.moveArmToPosition(IntakeArmConstants.ArmHomePosition);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
  
    return m_IntakeArmSubsystem.isHome();
  }
}
