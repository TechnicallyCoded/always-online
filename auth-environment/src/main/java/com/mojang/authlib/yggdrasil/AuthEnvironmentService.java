package com.mojang.authlib.yggdrasil;

import com.mojang.authlib.Environment;

public abstract class AuthEnvironmentService extends YggdrasilMinecraftSessionService{

	protected final YggdrasilMinecraftSessionService oldSessionService;

	public AuthEnvironmentService(Object oldSessionService, YggdrasilAuthenticationService authenticationService, Object enviroment){
		super(authenticationService, (Environment)enviroment);
		this.oldSessionService = (YggdrasilMinecraftSessionService) oldSessionService;
	}
	
}
