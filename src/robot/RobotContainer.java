/*
 *	  Copyright (C) 2022  John H. Gaby
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, version 3 of the License.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *    
 *    Contact: robotics@gabysoft.com
 */


package robot;

import edu.wpi.first.wpilibj2.command.Command;
import frc.team3128.common.hardware.input.NAR_Joystick;
import robotCore.GenericHID;
//also be sure to import joystick
import robotCore.Joystick;
//import literally everything (all subsystems and commands)


import robot.commands.CmdArcadeDrive;
import robot.commands.CmdFeedAndShoot;
import robot.commands.CmdFeeder;
import robot.commands.CmdShooter;
import robot.commands.CmdTurntable;

import robot.subsystems.DriveSubsystem;
import robot.subsystems.FeederSubsystem;
import robot.subsystems.ShooterSubsystem;
import robot.subsystems.TurntableSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  //you know the drill, define subsystems and joystick
  private final DriveSubsystem m_drive = new DriveSubsystem();
  private final ShooterSubsystem m_shooter = new ShooterSubsystem();
  private final FeederSubsystem m_feeder = new FeederSubsystem();
  private final TurntableSubsystem m_turntable = new TurntableSubsystem();
  private final NAR_Joystick m_Nar_Joystick = new NAR_Joystick(0);

  public RobotContainer() {
    //everything you include here is stuff that you want the minibot to do
    configureButtonBindings();
    m_drive.setDefaultCommand(new CmdArcadeDrive(m_drive, m_Nar_Joystick));
    
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by instantiating a {@link GenericHID} or one of its subclasses
   * ({@link edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then
   * passing it to a {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    //configure your joystick buttons to each command here!
    m_Nar_Joystick.getButton(1).whileTrue(new CmdShooter(m_shooter, 0.8));
    m_Nar_Joystick.getButton(2).whileTrue(new CmdFeeder(m_feeder, 0.6));
    m_Nar_Joystick.getButton(3).whileTrue(new CmdTurntable(m_turntable, 0.6));
    m_Nar_Joystick.getButton(4).whileTrue(new CmdTurntable(m_turntable, -0.6));
    m_Nar_Joystick.getButton(5).whileTrue(new CmdFeedAndShoot(m_feeder, m_shooter, 0.5, 0.8));
 
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
