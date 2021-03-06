/*
 * **************************************************************************
 * Molecular Dynamics - Particles under the microscope
 * **************************************************************************
 * Copyright (C) 2014-2017 Mikhail Kulesh
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * **************************************************************************
 */

package com.mkulesh.mmd.model;


/**
 * General types and constants
 */
public class Constants
{

    /**
     * Atomic mass unit
     */
    public static final double AEM = 1.66053892e-27;

    /**
     * The angstrom unit
     */
    public static final double Angstrom = 1.0e-10;

    /**
     * The electron volt unit
     */
    public static final double EV = 1.602176565e-19;

    /**
     * Coefficient used to obtain dimensionless equation of motions:
     */
    public static final double AK = 1.036427e-28;

    /**
     * The Boltzmann constant kB [J/K]
     */
    public static final double kB = 1.3806488e-23;

    /**
     * The femtosecond
     */
    public static final double FSec = 1.0e-15;

    /**
     * Output value used by different calculation methods
     */
    public enum CalculationType
    {
        SUCCESS, // Calculation was successfully
        EXT_INTERRUPT, // Calculation has been interrupted by an external thread
        NAN_DETECTED // Calculation is interrupted since NaN detection
    }

    /**
     * Type defining the energy normalization
     */
    public enum EnergyNormType
    {
        FULL_ENERGY(0),
        TEMPERATURE(1),
        NONE(2);
        private final int value;

        private EnergyNormType(int v)
        {
            this.value = v;
        }

        public int value()
        {
            return this.value;
        }
    }

    /**
     * Type defining the boundary condition
     */
    public enum BoundaryConditionType
    {
        REFLECTION,
        TRANSLATION
    }

    /**
     * Type defining the used potential
     */
    public enum PotentialType
    {
        LENNARD_JONES(0),
        MORSE(1),
        BORN_MAYER(2);
        private final int value;

        private PotentialType(int v)
        {
            this.value = v;
        }

        public int value()
        {
            return this.value;
        }
    }

}
