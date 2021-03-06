/*******************************************************************************
 * This file is part of the Symfony eclipse plugin.
 * 
 * (c) Robert Gruendler <r.gruendler@gmail.com>
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.dubture.symfony.debug;

import org.eclipse.php.internal.debug.core.xdebug.dbgp.XDebugDebuggerConfiguration;

import com.dubture.symfony.debug.launch.SymfonyWebLaunchConfigurationDelegate;

/**
 * 
 * 
 * 
 * @author Robert Gruendler <r.gruendler@gmail.com>
 *
 */
@SuppressWarnings("restriction")
public class DebuggerConfiguration extends XDebugDebuggerConfiguration {
	
	public static final String ID = "com.dubture.symfony.debug.xdebugger";
	
	public String getWebLaunchDelegateClass() {
		return SymfonyWebLaunchConfigurationDelegate.class.getName();
	}
	
}
