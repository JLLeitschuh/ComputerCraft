/**
 * This file is part of ComputerCraft - http://www.computercraft.info
 * Copyright Daniel Ratcliffe, 2011-2016. Do not distribute without permission.
 * Send enquiries to dratcliffe@gmail.com
 */

package dan200.computercraft.shared.peripheral.commandblock;

import dan200.computercraft.api.peripheral.IPeripheral;
import dan200.computercraft.api.peripheral.IPeripheralProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class CommandBlockPeripheralProvider implements IPeripheralProvider
{
    @Override
    public IPeripheral getPeripheral( World world, BlockPos pos, EnumFacing side )
    {
        TileEntity tile = world.getTileEntity( pos );
        if( tile != null && tile instanceof TileEntityCommandBlock )
        {
            TileEntityCommandBlock commandBlock = (TileEntityCommandBlock)tile;
            return new CommandBlockPeripheral( commandBlock );
        }
        return null;
    }
}
