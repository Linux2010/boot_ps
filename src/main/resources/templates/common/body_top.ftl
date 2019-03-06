
	<body class="no-skin">
		<div id="navbar" class="navbar navbar-default ace-save-state navbar-fixed-top">
			<div class="navbar-container ace-save-state" id="navbar-container">
				<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
					<span class="sr-only">Toggle sidebar</span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>
				</button>

				<div class="navbar-header pull-left">
					<a href="" class="navbar-brand">
						<span id = "department"><small>
							<i class="ace-icon fa fa-signal"></i>
						</small>
							T9VG 主机游戏
						</span>

					</a>
				</div>
			</div><!-- /.navbar-container -->
		</div>
        <div class="main-container ace-save-state" id="main-container">
            <script type="text/javascript">
                try{ace.settings.loadState('main-container')}catch(e){}
            </script>

            <div id="sidebar" class="sidebar responsive ace-save-state" data-sidebar="true" data-sidebar-scroll="true" data-sidebar-hover="true">
                <script type="text/javascript">
                    try{ace.settings.loadState('sidebar')}catch(e){}
                </script>

                <div class="sidebar-shortcuts" id="sidebar-shortcuts">
                    <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
                        <button class="btn btn-success" style="width: auto" id="ds" onclick="ds()">
                            <i class="fa fa-leaf"> 赞助&打赏</i>
                        </button>
                       <#-- <button class="btn btn-info">
                            <i class="ace-icon fa fa-pencil"></i>
                        </button>

                        <button class="btn btn-warning">
                            <i class="ace-icon fa fa-users"></i>
                        </button>-->

                        <#--<button class="btn btn-danger">
                            <i class="ace-icon fa fa-cogs"> 游戏&主机回收</i>
                        </button>-->
                    </div>

                    <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
                        <span class="btn btn-success"></span>

                        <span class="btn btn-info"></span>

                        <span class="btn btn-warning"></span>

                        <span class="btn btn-danger"></span>
                    </div>
                </div><!-- /.sidebar-shortcuts -->

                <ul class="nav nav-list" style="top: 0px;">
                    <li class="">
                        <a href="${ctx}/index/">
                            <i class="menu-icon fa fa-desktop"></i>
                            <span class="menu-text"> 首页&公告 </span>
                        </a>

                        <b class="arrow"></b>
                    </li>


                    <li class="">
                        <a href="${ctx}/game/ps4">
                            <i class="menu-icon fa fa-list-alt"></i>
                            <span class="menu-text"> PS4游戏资源 </span>
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="${ctx}/game/ns">
                            <i class="menu-icon fa fa-list"></i>

                            <span class="menu-text">
								NS游戏资源
							</span>
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="${ctx}/game/psv">
                            <i class="menu-icon fa fa-picture-o"></i>
                            <span class="menu-text"> PSV游戏资源 </span>
                        </a>

                        <b class="arrow"></b>
                    </li>

                </ul><!-- /.nav-list -->

                <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
                    <i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
                </div>
            </div>


