/**
 * This code is part of WoT, a plugin for Freenet. It is distributed 
 * under the GNU General Public License, version 2 (or at your option
 * any later version). See http://www.gnu.org/ for details of the GPL.
 */
package plugins.WoT;

/**
 * @author Julien Cornuwel (batosai@freenetproject.org)
 *
 */
public class DuplicateIdentityException extends Exception {
	
	private static final long serialVersionUID = -1;

	public DuplicateIdentityException(String message) {
		super(message);
	}
}
