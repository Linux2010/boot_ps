</div><!-- /.row -->
</div><!-- /.page-content -->
</div>
</div><!-- /.main-content -->
<div class="modal modal-danger fade" id="ds-modal" style="display: none;">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span></button>
                <h4 class="modal-title">微信赞赏</h4>
            </div>
            <div class="modal-body">
                <img id="ds-img" style="width: 550px; height: 550px" src="https://img.alicdn.com/imgextra/i4/295305335/O1CN017TYNrR1pHTVumoZS2_!!295305335.jpg">
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <div class="footer-inner">
        <div class="footer-content">
						<span class="bigger-120">
							<span class="blue bolder">本站资源严禁商业用途,资源均为互联网资源,下载后传播与本站无关</span>
						</span>

            &nbsp; &nbsp;
            <span class="action-buttons">
							<#--<a href="#">-->
								<#--<i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>-->
							<#--</a>-->

							<#--<a href="#">-->
								<#--<i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>-->
							<#--</a>-->

							<#--<a href="#">-->
								<#--<i class="ace-icon fa fa-rss-square orange bigger-150"></i>-->
							<#--</a>-->
						</span>
        </div>
    </div>
</div>

<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
    <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
</a>
</div><!-- /.main-container -->

<!-- basic scripts -->

<!--[if !IE]> -->
<script src="${ctx}/assets/js/jquery-2.1.4.min.js"></script>

<!-- <![endif]-->

<!--[if IE]>
<script src="${ctx}/assets/js/jquery-1.11.3.min.js"></script>
<![endif]-->
<script type="text/javascript">
    if('ontouchstart' in document.documentElement) document.write("<script src='${ctx}/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>
<script src="${ctx}/assets/js/bootstrap.min.js"></script>

<!-- page specific plugin scripts -->

<!--[if lte IE 8]>
<script src="${ctx}/assets/js/excanvas.min.js"></script>
<![endif]-->


<!-- ace scripts -->
<script src="${ctx}/assets/js/ace-elements.min.js"></script>
<script src="${ctx}/assets/js/ace.min.js"></script>

<script src="${ctx}/assets/js/bootstrap.modal.js"></script>

<script type="text/javascript">
    function ds() {
        $("#ds-img").attr("src","https://img.alicdn.com/imgextra/i4/295305335/O1CN017TYNrR1pHTVumoZS2_!!295305335.jpg");
        $("#ds-modal").modal("show");
    }

</script>
