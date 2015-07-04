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
 * CvConc will convert concentrations from ppm to milligrams per cubic meter
 * or vise versa. The conversions assume 25 degrees C at 1 atmosphere.
 * @author Tom Cavil
 */
public class CvConc {

    int mw = 0;
/**
 * The molecular weight of the compound of interest is required.
 * @param mw 
 */
    public CvConc(int mw) {
        this.mw = mw;
    }
/**
 * Supplying the concentration in parts per million will return the
 * concentration in milligrams per cubic meter
 * @param ppm
 * @return 
 */
    public double setPpm(int ppm) {
        double mgm3;
        mgm3 = (ppm * mw) / 24.45;
        return mgm3;
    }
/**
 * Supplying the concentration in milligrams per cubic meter will return the
 * concentration in parts per million
 * @param mgm3
 * @return 
 */
    public double setMgm3(int mgm3) {
        double ppm;
        ppm = (mgm3 * 24.45) / mw;
        return ppm;
    }

}
