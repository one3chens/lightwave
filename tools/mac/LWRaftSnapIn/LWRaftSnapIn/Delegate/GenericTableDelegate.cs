/*
 * Copyright © 2012-2017 VMware, Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the “License”); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS, without
 * warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
using System;
using AppKit;
using Foundation;

namespace LWRaftSnapIn.Delegate
{
	public class GenericTableDelegate : NSTableViewDelegate
	{
		private NSImage directoryIcon;

		public GenericTableDelegate()
		{
			directoryIcon = NSImage.ImageNamed("object.png");
		}

		public override void WillDisplayCell(NSTableView tableView, NSObject cell,
											 NSTableColumn tableColumn, nint row)
		{
			try
			{
				if (tableColumn.Identifier == "Name" || tableColumn.Identifier == "Attribute")
				{
					NSBrowserCell browserCell = cell as NSBrowserCell;
					if (browserCell != null)
					{
						browserCell.Leaf = true;
						browserCell.Image = directoryIcon;
					}
				}
			}
			catch (Exception e)
			{
				System.Diagnostics.Debug.WriteLine("Exception in casting : " + e.Message);
			}
		}
	}
}

