﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Runtime.InteropServices;
namespace VMCertStore.Client
{
    {
        public string ServerName { get; protected set; }
        public VMCertStoreClient(string serverName)
        {
            ServerName = serverName;
        }
        public string GetVersion()
        {
        }
    }
}