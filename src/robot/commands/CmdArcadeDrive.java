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

package robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team3128.common.hardware.input.NAR_Joystick;
import robot.subsystems.DriveSubsystem;


public class CmdArcadeDrive extends CommandBase {
  //define stuff like your subsystem and joystick here (we use NAR_Joystick!) (since it's drive)

  /**
   * Creates a new ArcadeDriveCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  
  public CmdArcadeDrive(DriveSubsystem subsystem, NAR_Joystick joystick) {
    //parameters include subsystem and the joystick

    addRequirements();
  }


  @Override
  public void initialize() {
    
  }


  @Override
  public void execute() {

    //get joystick's y and x here and make sure they're always positive 
    //hello

    //set power here
  }


  //put isFinished() here

  @Override
  public void end(boolean interrupted) {

  }
}