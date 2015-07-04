/*
 * Copyright (C) 2015 Tom Cavil
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.me.ihtools;

/**
 * BriefScala will adjust an 8-hr exposure limit to account for a work shift 
 * extended beyond 8 hours. Uses the Brief and Scala model and carries with
 * it the limitations of that model.
 * @author Tom Cavil
 */
public class BriefScala {
    double oel;
    double hoursWorked;
    
    /**
     * Takes the current 8-hr OEL and the actual hours worked as parameters
     * @param oel
     * @param hoursWorked
     */
    public BriefScala(double oel, double hoursWorked ){
        this.oel = oel;
        this.hoursWorked = hoursWorked;
    }
        
    /**
     * Returns the OEL adjusted according to the Brief and Scala model.
     * @return 
     */
    public double bsOel(){
        
        return (8 / hoursWorked) * ((24 - hoursWorked) / 16);
        
    }
}